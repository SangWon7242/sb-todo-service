import type { NextConfig } from "next";

const nextConfig: NextConfig = {
  async rewrites() {
    return [
      {
        source: "/api/:path*", // 기존 API 경로
        destination: "http://localhost:8080/api/:path*", // 백엔드 서버 경로
      },
    ];
  },
};

export default nextConfig;
